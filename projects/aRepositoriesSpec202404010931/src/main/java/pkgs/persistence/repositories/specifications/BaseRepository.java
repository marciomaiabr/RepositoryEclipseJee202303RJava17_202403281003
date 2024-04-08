package pkgs.persistence.repositories.specifications;

import java.util.List;

public interface BaseRepository<T> {

	T save(T entity);
	T get(Integer id);
	List<T> list();
	void delete(T entity);

}
