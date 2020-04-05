import angular from 'angular';
import template from './unidade-federativa-form.html'
import unidadeFederativaService from '../../unidade-federativa.service';

export default angular.module('unidadeFederativaForm', [])
    .factory(unidadeFederativaService.name, unidadeFederativaService.factory)
    .component('unidadeFederativaForm', {
        template,
        controller: ['$rootScope', unidadeFederativaService.name, function ($rootScope, unidadeFederativa) {
            const ctrl = this;

            ctrl.state = {nome: '', sigla: ''};
            ctrl.error = null;

            ctrl.save = () => {
                unidadeFederativa.save(ctrl.state)
                    .then(() => {
                        ctrl.state = {nome: '', sigla: ''};
                        $rootScope.$broadcast('updateUnidadesFederativas')
                    })
                    .catch(error => {
                        ctrl.error = error.data.message
                    })
            };

            $rootScope.$on('editUnidadesFederativas', function (event, data) {
                ctrl.state = data
            })
        }],
    }).name;
