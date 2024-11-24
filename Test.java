package TPexception;

public class Test {

    public static void main(String[] args) {
        try {
            double x = Double.parseDouble(args[0]);
            double n = Double.parseDouble(args[1]);
            if (n == 0) {
                throw new ArithmetqueException ("Impossible de faire une division par zéro !");
            }
            if (x==-3) {
            	throw new NegatifException ("-3 est négatif : on ne peut pas calculer une racine pour un réel négatif !!!!!!");
            }

            System.out.println(Mathematique.f(x, n));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne. " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Les arguments doivent être des nombres. " + e.getMessage());
        } catch (ArithmetqueException e) {
            System.out.println(e.getMessage());
        }
        catch (NegatifException e) {
        	System.out.println(e.getMessage());
        }
    }
}
