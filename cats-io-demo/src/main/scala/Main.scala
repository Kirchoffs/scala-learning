import cats.effect.IO
import cats.effect.unsafe.implicits.global
import cats.implicits._

object Main extends App {
    def runDirect(): IO[Unit] = for {
        _ <- IO(println("Hi there!"))
        _ <- IO(println("Hi here!"))
    } yield ()

    def runWithReuse(): IO[Unit] = {
        val printF = IO(println("Hi there!"))
        
        for {
            _ <- printF
            _ <- printF
        } yield ()
    }

    val run: IO[Unit] = for {
        _ <- IO.println("Running direct version:")
        _ <- runDirect()
        _ <- IO.println("Running reused version:")
        _ <- runWithReuse()
    } yield ()

    run.unsafeRunSync()
}
