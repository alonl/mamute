package org.mamute.brutauth.auth.rules;

import static org.mamute.auth.rules.ComposedRule.composedRule;
import static org.mamute.auth.rules.Rules.hasKarma;
import static org.mamute.auth.rules.Rules.isAuthor;
import static org.mamute.auth.rules.Rules.isModerator;

import javax.inject.Inject;

import org.mamute.auth.rules.PermissionRulesConstants;
import org.mamute.model.Answer;
import org.mamute.model.LoggedUser;
import org.mamute.model.User;

import br.com.caelum.brutauth.auth.rules.CustomBrutauthRule;

public class EditAnswerRule implements CustomBrutauthRule {
	private User user;

	@Deprecated
	public EditAnswerRule() {
	}
	
	@Inject
	public EditAnswerRule(LoggedUser user) {
		this.user = user.getCurrent();
	}

	public boolean isAllowed(Answer answer) {
		int karma = PermissionRulesConstants.EDIT_ANSWER;
		return composedRule(isAuthor()).or(hasKarma(karma)).or(isModerator()).isAllowed(user, answer);
	}
}

