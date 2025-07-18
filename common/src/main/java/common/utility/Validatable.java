package common.utility;

/**
 * Интерфейс для классов, поля которых могут быть вадидными или нет.
 */
public interface Validatable {
    /**
     * Проверяет поля на валидность
     * @return true - валидны, false в противном случае
     */
    boolean validate();
}