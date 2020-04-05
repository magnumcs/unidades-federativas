import angular from 'angular';
import template from './home.html';
import unidadeFederativaForm from '../../components/unidade-federativa-form/unidade-federativa-form';
import unidadeFederativaList from '../../components/unidade-federativa-list/unidade-federativa-list';

export default angular
    .module('home', [unidadeFederativaForm, unidadeFederativaList])
    .component('home', {
        template,
    }).name;
