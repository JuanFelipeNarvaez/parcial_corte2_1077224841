import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar, IonList, IonItem, IonLabel, IonButton, IonGrid } from '@ionic/react';

const Paciente: React.FC = () => {
  return (
    <IonContent>
      <IonGrid>
        <IonButton color="success">Crear Paciente</IonButton>
        <IonList>
          <IonItem>
            <IonLabel>Maria</IonLabel>
            <IonLabel>16/04/2024</IonLabel>
            <IonButton color="warning">Actualizar</IonButton>
            <IonButton color="danger">Eliminar</IonButton>
          </IonItem>
          <IonItem>
            <IonLabel>Sofia</IonLabel>
            <IonLabel>04/08/2000</IonLabel>
            <IonButton color="warning">Actualizar</IonButton>
            <IonButton color="danger">Eliminar</IonButton>
          </IonItem>
        </IonList>
      </IonGrid>
    </IonContent>
  );
};
export default Paciente;