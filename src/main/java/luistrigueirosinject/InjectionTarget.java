package luistrigueirosinject;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class InjectionTarget {
    private List<SomeInterface> beansOfSomeInterface;

    public InjectionTarget(List<SomeInterface> beansOfSomeInterface) {
        this.beansOfSomeInterface = beansOfSomeInterface;
    }

    public List<SomeInterface> getBeansOfSomeInterface() {
        return beansOfSomeInterface;
    }
}
