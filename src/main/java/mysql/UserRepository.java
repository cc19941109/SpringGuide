package mysql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

/**
 * 可以不加 @Repository("userRepository")
 * spring1.5 会自动扫描产生bean
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}