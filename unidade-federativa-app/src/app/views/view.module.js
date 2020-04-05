import angular from 'angular';
import config from '../common/config';

import homeView from './home/home';

export default angular.module(`${config.appName}.views`, [
    homeView
]).name;
