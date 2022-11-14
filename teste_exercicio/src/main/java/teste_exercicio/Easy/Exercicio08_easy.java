package teste_exercicio.Easy;

public class Exercicio08_easy {
  public Double calculaImpostoRenda(Double sal) {
    Double impRend = 0.0;

    if (sal <= 1903.98) {
      impRend = 0.0;
    }

    if (sal > 1903.98 && sal <= 2826.65) {
      impRend = ((sal * 0.075) - 142.8);
      if (impRend <= 0) {
        impRend = 0.0;
      }
    }

    if (sal > 2826.65 && sal <= 3751.05) {
      impRend = ((sal * 0.15) - 354.8);
      if (impRend <= 0) {
        impRend = 0.0;
      }
    }

    if (sal > 3751.05 && sal <= 4664.68) {
      impRend = ((sal * 0.225) - 636.13);
      if (impRend <= 0) {
        impRend = 0.0;
      }
    }

    if (sal > 4664.68) {
      impRend = (sal * 0.275) - 869.36;
      if (impRend <= 0) {
        impRend = 0.0;
      }
    }
    return impRend;
  }

  public Double calcularSalarioLiquido (Double sal, Double impRend) {
    return  sal - impRend;
}
}