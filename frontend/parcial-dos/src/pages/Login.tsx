import { IonButton, IonCol, IonContent, IonGrid, IonHeader, IonIcon, IonInput, IonLabel, IonPage, IonRow, IonTitle, IonToolbar } from '@ionic/react';
import './Login.css';
import {personOutline, lockClosedOutline } from 'ionicons/icons';

const Login: React.FC = () => {
  return (
    <IonPage className='ion-padding'>
      <IonContent>
        <IonGrid className='formContainer'>
          <IonRow>
            <IonCol size='12' size-md='6'>
              <form className='loginForm'>
                <IonInput className='inputFields'>
                  <div slot='label'>
                    <IonIcon icon={personOutline}></IonIcon>
                  </div>
                </IonInput>
                <IonInput type='password' className='inputFields'>
                  <div slot='label'>
                    <IonIcon icon={lockClosedOutline}></IonIcon>
                  </div>
                </IonInput>
                <IonButton shape='round' className='button' expand='full'>
                  Login
                </IonButton>
                <IonButton color="success" fill="clear" expand='full' shape='round'>Register</IonButton>
              </form>
            </IonCol>
          </IonRow>
        </IonGrid>
      </IonContent>
    </IonPage>
  );
};

export default Login;