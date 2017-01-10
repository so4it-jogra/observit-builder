package se.observit.common.builder;

/**
 * A builder interface that replaces the {@link java.lang.Cloneable} interface.
 *
 * = Usage
 *
 * [source,java]
 * ----
 * public class SomeClass implements CloneBuilder<Builder>{
 *    public static class AClassBuilder implements Builder<SomeClass>{
 *        public SomeClass build(){
 *            ...
 *        }
 *    }
 * }
 * ----
 *
 *
 * Created by Joakim Gradin on 2017-01-10.
 * <mailto:joakim.gradin@observit.se/>
 */
public interface CloneBuilder<V extends Builder<?>> {

    /**
     * Create a builder that clones the owning instance before returning.
     *
     * @return A builder that has cloned the owning instance before returning
     */
    V cloneBuilder();
}