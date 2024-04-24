import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar, IonList, IonItem, IonLabel, IonButton, IonGrid, IonInput, IonRow, IonCol, IonIcon } from '@ionic/react';
import './Estilos.css';

const Doctor: React.FC = () => {
  return (
    <IonPage>
      <IonHeader>
        <IonToolbar color="danger">
          <IonTitle>Doctor</IonTitle>
        </IonToolbar>
      </IonHeader>
      <IonContent>
      <IonGrid className='formContainer'>
          <IonRow>
            <IonCol size='12' size-md='6'>
              <form className='loginForm'>
                <IonInput type="text"className='inputFields' label="Nombre">
                </IonInput>
                <IonInput type='text' className='inputFields' label="Especialidad:">
                </IonInput>
                <IonButton shape='round' className='button' expand='full' color="success" href='Inicio'>
                  Guardar
                </IonButton>
              </form>
            </IonCol>
          </IonRow>
        </IonGrid>
      </IonContent>
    </IonPage>
  );
};

export default Doctor;
