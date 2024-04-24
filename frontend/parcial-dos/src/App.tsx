import { Redirect, Route } from 'react-router-dom';
import { IonApp, IonRouterOutlet, setupIonicReact } from '@ionic/react';
import { IonReactRouter } from '@ionic/react-router';
import Doctor from './pages/Doctor';
import Paciente from './pages/Paciente';
import Inicio from './pages/Inicio';

/* Core CSS required for Ionic components to work properly */
import '@ionic/react/css/core.css';

/* Basic CSS for apps built with Ionic */
import '@ionic/react/css/normalize.css';
import '@ionic/react/css/structure.css';
import '@ionic/react/css/typography.css';

/* Optional CSS utils that can be commented out */
import '@ionic/react/css/padding.css';
import '@ionic/react/css/float-elements.css';
import '@ionic/react/css/text-alignment.css';
import '@ionic/react/css/text-transformation.css';
import '@ionic/react/css/flex-utils.css';
import '@ionic/react/css/display.css';

/* Theme variables */
import './theme/variables.css';

setupIonicReact();

const App: React.FC = () => (
  <IonApp>
    <IonReactRouter>
      <IonRouterOutlet>
        <Route exact path="/doctor">
          <Doctor />
        </Route>
        <Route exact path="/">
          <Redirect to="/doctor" />
        </Route>
        <Route exact path="/paciente">
          <Paciente />
        </Route>
        <Route exact path="/">
          <Redirect to="/paciente" />
        </Route>
        <Route exact path="/inicio">
          <Inicio />
        </Route>
        <Route exact path="/">
          <Redirect to="/inicio" />
        </Route>
      </IonRouterOutlet>
    </IonReactRouter>
  </IonApp>
);

export default App;
