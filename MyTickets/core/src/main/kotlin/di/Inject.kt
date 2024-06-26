package di

import org.koin.core.Koin

object Inject {

    private var _di: Koin? = null

    val di: Koin
        get() = requireNotNull(_di)

    fun createDependencies(tree: Koin) {
        _di = tree
    }

    inline fun <reified T> instance(): T = di.get()
}