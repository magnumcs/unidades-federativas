import angular from 'angular';
import template from './unidade-federativa-list.html'
import unidadeFederativaService from '../../unidade-federativa.service';

export default angular.module('unidadeFederativaList', [])
    .factory(unidadeFederativaService.name, unidadeFederativaService.factory)
    .component('unidadeFederativaList', {
        template,
        controller: ['$rootScope', unidadeFederativaService.name, function ($rootScope, unidadeFederativa) {
            const ctrl = this;
            ctrl.states = [];

            ctrl.remove = (id) => {
                unidadeFederativa.remove(id)
                    .then(() => {
                        listarUnidadesFederativas();
                    });
            };

            ctrl.edit = (payload) => {
                $rootScope.$broadcast('editUnidadesFederativas', payload)
            };

            $rootScope.$on('updateUnidadesFederativas', function () {
                listarUnidadesFederativas();
            });

            const listarUnidadesFederativas = () => {
                unidadeFederativa.listarUnidadesFederativas()
                    .then(result => {
                        ctrl.states = result;
                    });
            };

            listarUnidadesFederativas();
        }],
    }).name;
