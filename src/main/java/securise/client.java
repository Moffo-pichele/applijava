package securise;

public class client {

    public class Client {
        public String nomclient;
        public String prenomclient;
        public String sexeclient;

        public String getNomclient() {
            return nomclient;
        }

        public void setNomclient(String nomclient) {
            this.nomclient = nomclient;
        }
        public String getPrenomclient() {
            return prenomclient;
        }
        public void setPrenomclient(String prenomclient) {
            this.prenomclient = prenomclient;
        }
        public String getSexeclient() {
            return sexeclient;
        }
        public void setSexeclient(String sexeclient) {
            this.sexeclient = sexeclient;
        }

        public Client(String nomclient, String prenomclient, String sexeclient) {
            this.nomclient = nomclient;
            this.prenomclient = prenomclient;
            this.sexeclient = sexeclient;
        }
    }

}
