package modelo;

/**
 *
 * @author Amanda
 */
public class Internet extends Servico{
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
}
