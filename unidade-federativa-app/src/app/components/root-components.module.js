import angular from 'angular';
import config from '../common/config';

import navbar from './navbar/navbar';

export default angular.module(`${config.appName}.rootComponents`, [
    navbar
]).name;
