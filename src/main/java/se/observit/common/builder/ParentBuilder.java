package se.observit.common.builder;

/**
 *
 * A builder interface implemented by parent classes in an inheritance chain that forces implementing
 * classes to implement provide a self reference.
 *
 * Created by Joakim Gradin on 2017-01-10.
 * <mailto:joakim.gradin@observit.se/>
 */
public interface ParentBuilder<T, U> extends Builder<U>
{
    /**
     * Provide a self reference to the implementing class
     *
     * @return The implementing class
     */
    T self();
}