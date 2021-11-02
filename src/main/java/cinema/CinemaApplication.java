package cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

	/*
	GET /filials - выводит список всех филиалов кинотеатра
	GET /rooms?filial=? - выводит список залов в указанном филиале
	GET /seanсes?date=?&filial - выводит список сеансов в филиале в определённую дату
	GET /places?seanсe=? - выводит список свободных/занятых мест на выбранный филиал
	GET /cinema?ids=[?] - список фильмов по заданным id

	POST /filials - добавить филиал (передаются комнаты)
	POST /cinema - добавить фильм
	POST /seances - добавить сеанс
	POST /order - забронировать места (бронью будет являться код, который вернёт запрос)

	DELETE /order?code=? - отменить бронь
	 */
}
