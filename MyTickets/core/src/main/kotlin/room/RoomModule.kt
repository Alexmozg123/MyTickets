package room

import androidx.room.Room
import androidx.room.RoomDatabase
import org.koin.dsl.module

private lateinit var contextManager: ContextManager

internal val roomModule = module {
    single<RoomDatabase> {
        Room.databaseBuilder(
            context = contextManager.getAppContext(),
            klass = MyDatabase::class.java,
            name = "reportsDB"
        ).fallbackToDestructiveMigration().build()
    }
}