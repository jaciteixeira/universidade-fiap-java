package br.com.fiap.universidade.servicos;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.fiap.universidade.model.Usuario;
import br.com.fiap.universidade.repository.UsuarioRepository;

@Service
public class UsuarioUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository uRep;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario_resgatado = uRep.findByUsername(username).orElseThrow(
				() -> new UsernameNotFoundException("Usuário " + username + " não encontrado na base de dados"));

		return new User(usuario_resgatado.getUsername(), usuario_resgatado.getPassword(), usuario_resgatado.getRoles()
				.stream().map(role -> new SimpleGrantedAuthority(role.getNome())).collect(Collectors.toList()));
	}

}
