package se.observit.common.builder;

/**
 *
 * /**
 * A builder interface used by anything that implements the builder pattern.
 *
 * = Usage
 *
 * [source,java]
 * ----
 * public class SomeClass{
 *
 *    private String attribute;
 *
 *    private SomeClass(AClassBuilder builder){*
 *    }
 *
 *    public static SomeClassBuilder builder { retrun new SomeClassBuilder(); }
 *    public static class SomeClassBuilder implements Builder<SomeClass>{
 *
 *        private String attribute;
 *
 *        public SomeClassBuilder withAttribute(String attribute){
 *            this.attribute = attribute;
 *            return this;
 *        }
 *
 *
 *        public SomeClass build(){
 *            new SomeClass(this);
 *        }
 *    }
 * }
 *
 *----
 *
 *
 * Created by Joakim Gradin on 2017-01-10.
 * <mailto:joakim.gradin@observit.se/>
 */
public interface Builder<T>
{
    T build();
}