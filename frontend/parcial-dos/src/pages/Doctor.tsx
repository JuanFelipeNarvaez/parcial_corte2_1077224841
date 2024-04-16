import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar, IonList, IonItem, IonLabel, IonButton, IonGrid } from '@ionic/react';
import ExploreContainer from '../components/ExploreContainer';

const Home: React.FC = () => {
  return (
    <IonContent>
      <IonGrid>
        <IonButton color="success">Crear Doctor</IonButton>
        <IonList>
          <IonItem>
            <IonLabel>Juan</IonLabel>
            <IonLabel>Cirujano</IonLabel>
            <IonButton color="warning">Actualizar</IonButton>
            <IonButton color="danger">Eliminar</IonButton>
          </IonItem>
          <IonItem>
            <IonLabel>Camilo</IonLabel>
            <IonLabel>Pediatra</IonLabel>
            <IonButton color="warning">Actualizar</IonButton>
            <IonButton color="danger">Eliminar</IonButton>
          </IonItem>
        </IonList>
      </IonGrid>
    </IonContent>
  );
};

export default Home;
