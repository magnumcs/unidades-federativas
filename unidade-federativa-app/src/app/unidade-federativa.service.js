import config from '../app/common/config';

const BASE_URL = config.api.base + config.api.resources.unidadefederativa;

export default {
    name: 'unidadeFederativaService',
    factory: ['$http', ($http) => {
        function listarUnidadesFederativas() {
            return $http.get(`${BASE_URL}`)
                .then(result => result.data)
                .catch(error => error);
        }

        function save(payload) {
            if (payload.id) {
                return $http.put(`${BASE_URL}/${payload.id}`, payload)
            }
            return $http.post(BASE_URL, payload)
        }

        function remove(id) {
            return $http.delete(`${BASE_URL}/${id}`)
                .then(result => result.data)
                .catch(error => error);
        }

        return {
            listarUnidadesFederativas,
            save,
            remove,
        };
    }]
};
