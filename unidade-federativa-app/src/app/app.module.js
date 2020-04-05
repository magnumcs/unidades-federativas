import angular from 'angular';
import config from './common/config';

import views from './views/view.module';
import rootComponents from './components/root-components.module';

import '@uirouter/angularjs';
import 'ng-table'
import './common/app.scss';
import '@fortawesome/fontawesome-free/js/fontawesome'
import '@fortawesome/fontawesome-free/js/solid'
import '@fortawesome/fontawesome-free/js/regular'
import '@fortawesome/fontawesome-free/js/brands'

angular.module(config.appName, [
    views,
    rootComponents,
    'ui.router',
    'ngTable',
]).config(['$stateProvider', '$locationProvider', ($stateProvider, $locationProvider) => {
    Object.keys(config.stateUrls).forEach(stateKey => {
        $stateProvider.state({
            name: stateKey,
            component: stateKey,
            url: config.stateUrls[stateKey]
        });
    });

    $locationProvider.html5Mode(true);
}]);

angular.element(document).ready(() => {
    angular.bootstrap(document, [config.appName], {strictDi: true});
});