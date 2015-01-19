package com.lecheria.lecheria.VO;

/**
 * Created by ale on 18/01/15.
 */
public class VacaVo {
    private double ubreID;
    private double ubreDD;
    private double ubreIT;
    private double ubreDT;

  VacaVo()
  {
      ubreDD=0;
      ubreDT=0;
      ubreID=0;
      ubreIT=0;
  }

    public double getUbreID() {
        return ubreID;
    }

    public void setUbreID(double ubreID) {
        this.ubreID = ubreID;
    }

    public double getUbreDD() {
        return ubreDD;
    }

    public void setUbreDD(double ubreDD) {
        this.ubreDD = ubreDD;
    }

    public double getUbreIT() {
        return ubreIT;
    }

    public void setUbreIT(double ubreIT) {
        this.ubreIT = ubreIT;
    }

    public double getUbreDT() {
        return ubreDT;
    }

    public void setUbreDT(double ubreDT) {
        this.ubreDT = ubreDT;
    }
}
