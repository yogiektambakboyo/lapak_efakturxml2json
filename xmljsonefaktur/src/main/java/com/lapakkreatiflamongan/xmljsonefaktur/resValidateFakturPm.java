package com.lapakkreatiflamongan.xmljsonefaktur;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "resValidatefakturPm")
public class resValidateFakturPm {
    @JacksonXmlProperty(localName = "kdJenisTransaksi")
    private String kdJenisTransaksi;

    @JacksonXmlProperty(localName = "fgPengganti")
    private String fgPengganti;
    @JacksonXmlProperty(localName = "nomorFaktur")
    private String nomorFaktur;
    @JacksonXmlProperty(localName = "tanggalFaktur")
    private String tanggalFaktur;
    @JacksonXmlProperty(localName = "npwpPenjual")
    private String npwpPenjual;
    @JacksonXmlProperty(localName = "namaPenjual")
    private String namaPenjual;
    @JacksonXmlProperty(localName = "alamatPenjual")
    private String alamatPenjual;
    @JacksonXmlProperty(localName = "npwpLawanTransaksi")
    private String npwpLawanTransaksi;
    @JacksonXmlProperty(localName = "namaLawanTransaksi")
    private String namaLawanTransaksi;
    @JacksonXmlProperty(localName = "alamatLawanTransaksi")
    private String alamatLawanTransaksi;
    @JacksonXmlProperty(localName = "jumlahDpp")
    private String jumlahDpp;
    @JacksonXmlProperty(localName = "jumlahPpn")
    private String jumlahPpn;
    @JacksonXmlProperty(localName = "jumlahPpnBm")
    private String jumlahPpnBm;
    @JacksonXmlProperty(localName = "statusApproval")
    private String statusApproval;
    @JacksonXmlProperty(localName = "statusFaktur")
    private String statusFaktur;
    @JacksonXmlProperty(localName = "referensi")
    private String referensi;


    @JacksonXmlProperty(localName = "detailTransaksi")
    @JacksonXmlElementWrapper(useWrapping = false)
    private detailTransaksi[] detailTransaksi;

    public String getKdJenisTransaksi() {
        return kdJenisTransaksi;
    }

    public void setKdJenisTransaksi(String kdJenisTransaksi) {
        this.kdJenisTransaksi = kdJenisTransaksi;
    }

    public String getFgPengganti() {
        return fgPengganti;
    }

    public void setFgPengganti(String fgPengganti) {
        this.fgPengganti = fgPengganti;
    }

    public String getNomorFaktur() {
        return nomorFaktur;
    }

    public void setNomorFaktur(String nomorFaktur) {
        this.nomorFaktur = nomorFaktur;
    }

    public String getTanggalFaktur() {
        return tanggalFaktur;
    }

    public void setTanggalFaktur(String tanggalFaktur) {
        this.tanggalFaktur = tanggalFaktur;
    }

    public String getNpwpPenjual() {
        return npwpPenjual;
    }

    public void setNpwpPenjual(String npwpPenjual) {
        this.npwpPenjual = npwpPenjual;
    }

    public String getNamaPenjual() {
        return namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    public String getAlamatPenjual() {
        return alamatPenjual;
    }

    public void setAlamatPenjual(String alamatPenjual) {
        this.alamatPenjual = alamatPenjual;
    }

    public String getNpwpLawanTransaksi() {
        return npwpLawanTransaksi;
    }

    public void setNpwpLawanTransaksi(String npwpLawanTransaksi) {
        this.npwpLawanTransaksi = npwpLawanTransaksi;
    }

    public String getNamaLawanTransaksi() {
        return namaLawanTransaksi;
    }

    public void setNamaLawanTransaksi(String namaLawanTransaksi) {
        this.namaLawanTransaksi = namaLawanTransaksi;
    }

    public String getAlamatLawanTransaksi() {
        return alamatLawanTransaksi;
    }

    public void setAlamatLawanTransaksi(String alamatLawanTransaksi) {
        this.alamatLawanTransaksi = alamatLawanTransaksi;
    }

    public String getJumlahDpp() {
        return jumlahDpp;
    }

    public void setJumlahDpp(String jumlahDpp) {
        this.jumlahDpp = jumlahDpp;
    }

    public String getJumlahPpn() {
        return jumlahPpn;
    }

    public void setJumlahPpn(String jumlahPpn) {
        this.jumlahPpn = jumlahPpn;
    }

    public String getJumlahPpnBm() {
        return jumlahPpnBm;
    }

    public void setJumlahPpnBm(String jumlahPpnBm) {
        this.jumlahPpnBm = jumlahPpnBm;
    }

    public String getStatusApproval() {
        return statusApproval;
    }

    public void setStatusApproval(String statusApproval) {
        this.statusApproval = statusApproval;
    }

    public String getStatusFaktur() {
        return statusFaktur;
    }

    public void setStatusFaktur(String statusFaktur) {
        this.statusFaktur = statusFaktur;
    }

    public String getReferensi() {
        return referensi;
    }

    public void setReferensi(String referensi) {
        this.referensi = referensi;
    }

    public com.lapakkreatiflamongan.xmljsonefaktur.detailTransaksi[] getDetailTransaksi() {
        return detailTransaksi;
    }

    public void setDetailTransaksi(com.lapakkreatiflamongan.xmljsonefaktur.detailTransaksi[] detailTransaksi) {
        this.detailTransaksi = detailTransaksi;
    }
}

class detailTransaksi {
    @JacksonXmlProperty(localName = "nama")
    private String nama;

    @JacksonXmlProperty(localName = "hargaSatuan")
    private String hargaSatuan;

    @JacksonXmlProperty(localName = "jumlahBarang")
    private String jumlahBarang;

    @JacksonXmlProperty(localName = "hargaTotal")
    private String hargaTotal;

    @JacksonXmlProperty(localName = "diskon")
    private String diskon;

    @JacksonXmlProperty(localName = "dpp")
    private String dpp;

    @JacksonXmlProperty(localName = "ppn")
    private String ppn;

    @JacksonXmlProperty(localName = "tarifPpnbm")
    private String tarifPpnbm;

    @JacksonXmlProperty(localName = "ppnbm")
    private String ppnbm;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(String hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public String getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(String jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public String getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(String hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public String getDiskon() {
        return diskon;
    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }

    public String getDpp() {
        return dpp;
    }

    public void setDpp(String dpp) {
        this.dpp = dpp;
    }

    public String getPpn() {
        return ppn;
    }

    public void setPpn(String ppn) {
        this.ppn = ppn;
    }

    public String getTarifPpnbm() {
        return tarifPpnbm;
    }

    public void setTarifPpnbm(String tarifPpnbm) {
        this.tarifPpnbm = tarifPpnbm;
    }

    public String getPpnbm() {
        return ppnbm;
    }

    public void setPpnbm(String ppnbm) {
        this.ppnbm = ppnbm;
    }
}
