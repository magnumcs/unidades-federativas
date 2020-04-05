import angular from 'angular';
import template from './navbar.html';

export default angular.module('navbar', [])
    .component('navbar', {
        template,
    }).name;
