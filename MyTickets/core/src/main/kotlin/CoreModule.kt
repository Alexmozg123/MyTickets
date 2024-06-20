import org.koin.dsl.module
import retrofit.retrofitModule
import room.roomModule

val coreModule = module {
    includes(
        retrofitModule,
        roomModule,
    )
}