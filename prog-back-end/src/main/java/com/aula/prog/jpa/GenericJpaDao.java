package com.aula.prog.jpa;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.aula.prog.interfaces.IGenericDao;

@Repository
public class GenericJpaDao<T extends Serializable>  extends AbstractJpaDao<T> implements IGenericDao<T> {

	@Override
	public T findOne(long id) {
		return super.findOne(id);
	}

}
