import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar, IonList, IonItem, IonLabel, IonButton, IonGrid, IonRow, IonCol, IonInput } from '@ionic/react';
import './Estilos.css';

const Paciente: React.FC = () => {
  return (
    <IonPage>
      <IonHeader>
        <IonToolbar color="warning">
          <IonTitle>Paciente</IonTitle>
        </IonToolbar>
      </IonHeader>
      <IonContent>
        <IonGrid className='formContainer'>
          <IonRow>
            <IonCol size='12' size-md='6'>
              <form className='loginForm'>
                <IonInput type="text" className='inputFields' label="Nombre">
                </IonInput>
                <IonInput type='date' className='inputFields' label="Fecha Nac">
                </IonInput>
                <IonInput type='number' className='inputFields' label="Id doctor">
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
export default Paciente;