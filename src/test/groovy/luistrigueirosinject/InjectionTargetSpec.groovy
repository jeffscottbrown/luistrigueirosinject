package luistrigueirosinject

import io.micronaut.context.ApplicationContext
import io.micronaut.context.BeanContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification


class InjectionTargetSpec extends Specification {

    @Shared
    @AutoCleanup
    BeanContext context = BeanContext.run()

    InjectionTarget injectionTarget = context.getBean(InjectionTarget)

    void 'test injection'() {
        when:
        def beans = injectionTarget.beansOfSomeInterface

        then:
        beans.size() == 2
        beans.find { it instanceof BeanOne }
        beans.find { it instanceof BeanTwo }
    }


}
