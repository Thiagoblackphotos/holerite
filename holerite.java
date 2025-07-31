
import java.util.Scanner;



public class holerite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Entrada dos valores para calculos de salario liquido
        System.out.println("Digite o valor do Salario bruto (Registrado em carteira)");
        double salarioBruto = scanner.nextDouble();

        System.out.println("Digite o valor do bônus: ");
        double bonus = scanner.nextDouble(); 


        System.out.println("houve adiantamento salarial de 40%? (sim/nao)");
        String resposta = scanner.next();

        double adiantamento = 0.0;
        if (resposta.equalsIgnoreCase("sim")) {adiantamento = salarioBruto * 0.4;
            
        }else resposta.equalsIgnoreCase("nao");{
            adiantamento = 0.0;
        }

        System.out.println("Você adotou o  vale-transporte? (sim/nao)");
        resposta = scanner.next();

        double valeTransporte = 0.0;
        if (resposta.equalsIgnoreCase(resposta)) {
            valeTransporte = salarioBruto * 0.06;
            
        }else resposta.equalsIgnoreCase("nao");{
            valeTransporte = 0.0;
        }

        System.out.println("holerite");
        System.out.println("salario bruto:" + salarioBruto);
        System.out.println("bonus:" + bonus);
        System.out.println("adiantamento:" + adiantamento);
        System.out.println("vale transporte:" + valeTransporte);
        System.out.println("INSS:" + calcularINSS(salarioBruto));
        System.out.println("salario liquido:" + calcularSalarioLquido(salarioBruto, bonus, adiantamento, valeTransporte));


        
        }

        public static double calcularSalarioLquido(double salarioBruto, double bonus, double adiantamento, double valeTransporte) {
            double inss = calcularINSS(salarioBruto);
            return (salarioBruto + bonus - adiantamento - valeTransporte - inss);
        }

        
        public static double calcularINSS(double salarioBruto) {
            if (salarioBruto <= 1518.00) {
                return salarioBruto * 0.075;
            }else if (salarioBruto <= 2793.88)
            {
                return salarioBruto * 0.09;
            }else if (salarioBruto <= 4190.83) {
                return salarioBruto * 0.12;
            }else if (salarioBruto <= 8157.41) {
                return salarioBruto * 0.14;
            }else if (salarioBruto > 8157.41) {return 919.38;
                
            }
            return 0.0; 
                
            }
                
            
                
        }

        

        
            
        

    
        
        
        
      
       
    
    


