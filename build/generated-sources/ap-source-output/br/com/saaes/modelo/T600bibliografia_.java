package br.com.saaes.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T600bibliografia.class)
public abstract class T600bibliografia_ {

	public static volatile SingularAttribute<T600bibliografia, Long> id;
	public static volatile SingularAttribute<T600bibliografia, Integer> qntComplementar;
	public static volatile SingularAttribute<T600bibliografia, Integer> qntDisciplina;
	public static volatile SingularAttribute<T600bibliografia, Integer> periodico;
	public static volatile SingularAttribute<T600bibliografia, Date> dtCadastro;
	public static volatile SingularAttribute<T600bibliografia, T900Usuario> t900UsuarioId;
	public static volatile SingularAttribute<T600bibliografia, T300cursos> t300CursoId;
	public static volatile SingularAttribute<T600bibliografia, Integer> mediaComplementar;
	public static volatile SingularAttribute<T600bibliografia, Integer> qntBasica;
	public static volatile SingularAttribute<T600bibliografia, Integer> mediaBasica;

}

