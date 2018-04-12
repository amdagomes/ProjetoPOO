package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Internet extends Servico implements Serializable {

    private float upload;
    private float download;
    private int MB;
    private String tecnologia;

    public Internet(float upload, float download, int MB, String tecnologia, float vInstalacao, float vMesalidade, int codigo) {
        super(vInstalacao, vMesalidade, codigo);
        this.upload = upload;
        this.download = download;
        this.MB = MB;
        this.tecnologia = tecnologia;
    }

    public Internet() {
        
    }

    public float getUpload() {
        return upload;
    }

    public void setUpload(float upload) {
        this.upload = upload;
    }

    public float getDownload() {
        return download;
    }

    public void setDownload(float download) {
        this.download = download;
    }

    public int getMB() {
        return MB;
    }

    public void setMB(int MB) {
        this.MB = MB;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Float.floatToIntBits(this.upload);
        hash = 47 * hash + Float.floatToIntBits(this.download);
        hash = 47 * hash + this.MB;
        hash = 47 * hash + Objects.hashCode(this.tecnologia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Internet other = (Internet) obj;
        if (Float.floatToIntBits(this.upload) != Float.floatToIntBits(other.upload)) {
            return false;
        }
        if (Float.floatToIntBits(this.download) != Float.floatToIntBits(other.download)) {
            return false;
        }
        if (this.MB != other.MB) {
            return false;
        }
        if (!Objects.equals(this.tecnologia, other.tecnologia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nServico de Internet\n" + "Upload: " + upload + "Mps \tDownload: " + download + "MB \nMB: " + MB
                + "\tTecnologia: " + tecnologia + "\n" + super.toString();
    }

}
