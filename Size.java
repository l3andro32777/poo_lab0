/**
 * Classe Enumerada Size (Tamanho de Chávenas)
 * 
 * @author Leandro Francisco - 200221041 (Turma 4)
 * 
 */
public enum Size
{
    
    SMALL(32, 36, "Pequeno",'S'),
    MEDIUM(37, 44, "Médio",'M'),
    LARGE(45, 52, "Grande",'L');
    private final String description; //descrição da chávena
    private final int minValue; //valor mínimo de capacidade
    private final int maxValue; //valor máximo de capacidade
    private final char code; //código da chávena

    /**
     * Construtor da Classe Enumerada Size
     */
    private Size(int minValue, int maxValue, String description, char code)
    {
        this.description=description;
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.code=code;
    }
    
    /**
     * Método que devolve a descrição, através de um "toString()"
     */
    @Override
    public String toString()
    {
        return this.description;
    }
    
    /**
     * Método que devolve a descrição
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Método que devolve o valor mínimo de capacidade
     */
    public int getMinValue()
    {
        return minValue;
    }
    
    /**
     * Método que devolve o valor máximo de capacidade
     */
    public int getMaxValue()
    {
        return maxValue;
    }
    
    /**
     * Método que devolve o código
     */
    public char getCode()
    {
        return code;
    }
}