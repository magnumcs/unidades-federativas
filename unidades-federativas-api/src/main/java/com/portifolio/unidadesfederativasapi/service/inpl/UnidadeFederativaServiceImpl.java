package com.portifolio.unidadesfederativasapi.service.inpl;

import com.portifolio.unidadesfederativasapi.exception.AlreadyExistsException;
import com.portifolio.unidadesfederativasapi.exception.InternaServerErrorException;
import com.portifolio.unidadesfederativasapi.exception.NotFoundException;
import com.portifolio.unidadesfederativasapi.model.UnidadeFederativa;
import com.portifolio.unidadesfederativasapi.repository.UnidadeFederativaRepository;
import com.portifolio.unidadesfederativasapi.service.UnidadeFederativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UnidadeFederativaServiceImpl implements UnidadeFederativaService {

    private final UnidadeFederativaRepository unidadeFederativaRepository;

    @Autowired
    public UnidadeFederativaServiceImpl(UnidadeFederativaRepository unidadeFederativaRepository) {
        this.unidadeFederativaRepository = unidadeFederativaRepository;
    }

    @Override
    public List<UnidadeFederativa> listarUnidadesFederativas() {
        return  unidadeFederativaRepository.findAll();
    }

    @Override
    public UnidadeFederativa buscarUnidadeFederativa(String sigla) throws NotFoundException {
        Optional<UnidadeFederativa> resultado =  unidadeFederativaRepository.getBySigla(sigla);
        if(resultado.isPresent()) {
            return resultado.get();
        }
        throw new NotFoundException(MessageFormat.format("Unidade Federativa não encontrada no sistema.", (Object) null));
    }

    @Override
    public UnidadeFederativa salvarUnidadeFederativa(UnidadeFederativa unidadeFederativa) throws InternaServerErrorException, AlreadyExistsException {
        Optional<UnidadeFederativa> resultado = unidadeFederativaRepository.getBySigla(unidadeFederativa.getSigla());
        if(resultado.isPresent()) {
            throw new AlreadyExistsException(MessageFormat.format("Unidade Federativa {0} já está cadastrada no sistema.", unidadeFederativa.getNome()));
        }
        try {
            unidadeFederativa.setDataRegistro(LocalDateTime.now());
            return unidadeFederativaRepository.save(unidadeFederativa);
        } catch (Exception e) {
            throw new InternaServerErrorException(MessageFormat.format("Erro ao tentar salvar unidade federativa.", (Object) null), e.getCause());
        }
    }

    @Override
    public void removerUnidadeFederativa(Long id) throws InternaServerErrorException {
        try {
            unidadeFederativaRepository.deleteById(id);
        } catch (Exception e) {
            throw new InternaServerErrorException(MessageFormat.format("Erro ao tentar remover unidade federativa.", (Object) null), e.getCause());
        }
    }

    @Override
    public UnidadeFederativa editarUnidadeFederativa(UnidadeFederativa unidadeFederativa) throws InternaServerErrorException {
        try {
            return unidadeFederativaRepository.save(unidadeFederativa);
        } catch (Exception e) {
            throw new InternaServerErrorException(MessageFormat.format("Erro ao tentar editar unidade federativa.", (Object) null), e.getCause());
        }
    }
}
