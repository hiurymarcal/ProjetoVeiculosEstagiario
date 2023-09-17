
public class Veiculo {
    private int codigo;
    private String nome;
    private String modelo;
    private String cor;
    private String chassi;
    private String placa;
    private int anoModelo;
    private int anoFabricacao;
    private String fabricante;
    private double potencia;
    private String tipoCombustivel;
    private String codigoRenavam;
    private String nomeProprietario;
    private String estadoUF;
    private String cidadeUF;
    private String tipoVeiculo;
    private int qtdeMotores;
    private int qtdeOcupantes;

    public Veiculo(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, double potencia, String tipoCombustivel, String codigoRenavam,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeMotores,
            int qtdeOcupantes) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.placa = placa;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.codigoRenavam = codigoRenavam;
        this.nomeProprietario = nomeProprietario;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
        this.tipoVeiculo = tipoVeiculo;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getEstadoUF() {
        return estadoUF;
    }

    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }

    public String getCidadeUF() {
        return cidadeUF;
    }

    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getQtdeMotores() {
        return qtdeMotores;
    }

    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }

    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }

    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }

    @Override
    public String toString() {
        return "Veiculo [codigo=" + codigo + ", nome=" + nome + ", modelo=" + modelo + ", cor=" + cor + ", chassi="
                + chassi + ", placa=" + placa + ", anoModelo=" + anoModelo + ", anoFabricacao=" + anoFabricacao
                + ", fabricante=" + fabricante + ", potencia=" + potencia + ", tipoCombustivel=" + tipoCombustivel
                + ", codigoRenavam=" + codigoRenavam + ", nomeProprietario=" + nomeProprietario + ", estadoUF="
                + estadoUF + ", cidadeUF=" + cidadeUF + ", tipoVeiculo=" + tipoVeiculo + ", qtdeMotores=" + qtdeMotores
                + ", qtdeOcupantes=" + qtdeOcupantes + "]";
    }
}


public class Aviao extends Veiculo {
    private int envergadura;

    public Aviao(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, double potencia, String tipoCombustivel, String codigoRenavam,
            String nomeProprietario, String estadoUF, String cidadeUF, int qtdeMotores, int qtdeOcupantes,
            int envergadura) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, potencia,
                tipoCombustivel, codigoRenavam, nomeProprietario, estadoUF, cidadeUF, "Aviao", qtdeMotores,
                qtdeOcupantes);
        this.envergadura = envergadura;
    }

    public int getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(int envergadura) {
        this.envergadura = envergadura;
    }
}


public class Caminhao extends Veiculo {
    private int capacidadeCarga;

    public Caminhao(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, double potencia, String tipoCombustivel, String codigoRenavam,
            String nomeProprietario, String estadoUF, String cidadeUF, int qtdeMotores, int qtdeOcupantes,
            int capacidadeCarga) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, potencia,
                tipoCombustivel, codigoRenavam, nomeProprietario, estadoUF, cidadeUF, "Caminhao", qtdeMotores,
                qtdeOcupantes);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}


public class Carro extends Veiculo {
    private boolean arCondicionado;

    public Carro(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, double potencia, String tipoCombustivel, String codigoRenavam,
            String nomeProprietario, String estadoUF, String cidadeUF, int qtdeMotores, int qtdeOcupantes,
            boolean arCondicionado) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, potencia,
                tipoCombustivel, codigoRenavam, nomeProprietario, estadoUF, cidadeUF, "Carro", qtdeMotores,
                qtdeOcupantes);
        this.arCondicionado = arCondicionado;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
}


public class Motocicleta extends Veiculo {
    private int cilindrada;

    public Motocicleta(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, double potencia, String tipoCombustivel, String codigoRenavam,
            String nomeProprietario, String estadoUF, String cidadeUF, int qtdeMotores, int qtdeOcupantes,
            int cilindrada) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, potencia,
                tipoCombustivel, codigoRenavam, nomeProprietario, estadoUF, cidadeUF, "Motocicleta", qtdeMotores,
                qtdeOcupantes);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}


public class Onibus extends Veiculo {
    private int capacidadePassageiros;

    public Onibus(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, double potencia, String tipoCombustivel, String codigoRenavam,
            String nomeProprietario, String estadoUF, String cidadeUF, int qtdeMotores, int qtdeOcupantes,
            int capacidadePassageiros) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, potencia,
                tipoCombustivel, codigoRenavam, nomeProprietario, estadoUF, cidadeUF, "Onibus", qtdeMotores,
                qtdeOcupantes);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
}


public class ProjetoVeiculosEstagiario {
    public static void main(String[] args) {


        Veiculo carro = new Carro(1, "Carro", "ModeloCarro", "Azul", "123456", "ABC1234", 2023, 2022, "FabricanteCarro",
                150.0, "Gasolina", "123456789", "ProprietarioCarro", "SP", "Sao Paulo", 1, 5, true);

        Veiculo aviao = new Aviao(2, "Aviao", "ModeloAviao", "Branco", "654321", "XYZ5678", 2023, 2022,
                "FabricanteAviao", 3000.0, "Querosene", "987654321", "ProprietarioAviao", "RJ", "Rio de Janeiro", 4,
                100, 50);

        Veiculo caminhao = new Caminhao(3, "Caminhao", "ModeloCaminhao", "Verde", "789012", "DEF9012", 2023, 2022,
                "FabricanteCaminhao", 350.0, "Diesel", "456789012", "ProprietarioCaminhao", "MG", "Belo Horizonte", 2,
                3, 10000);

        System.out.println(carro.toString());
        System.out.println(aviao.toString());
        System.out.println(caminhao.toString());
    }
}

