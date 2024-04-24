import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar, IonList, IonItem, IonLabel, IonButton, IonGrid, IonButtons, IonBackButton, IonMenuButton, IonMenu, IonRow, IonCol } from '@ionic/react';
import './Estilos.css';

const Inicio: React.FC = () => {
    return (
        <IonPage>
            <IonHeader>
                <IonToolbar color="primary">
                    <IonTitle>Inicio</IonTitle>
                </IonToolbar>
            </IonHeader>
            <IonContent>
                <IonGrid className='formContainer'>
                    <IonRow>
                        <IonCol size='12' size-md='6'>
                            <form className='loginForm'>
                                <IonButton color="success" expand='full' shape='round' href='doctor'>Crear doctor</IonButton>
                                <IonButton color="primary" expand='full' shape='round' href='paciente'>Crear paciente</IonButton>
                            </form>
                        </IonCol>
                    </IonRow>
                </IonGrid>
            </IonContent>
        </IonPage>
    );
};

export default Inicio;