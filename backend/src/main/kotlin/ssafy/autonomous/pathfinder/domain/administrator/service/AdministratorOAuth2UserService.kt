package ssafy.autonomous.pathfinder.domain.administrator.service

import ssafy.autonomous.pathfinder.Building.domain.AdministratorOAuth2User

interface AdministratorOAuth2UserService {

    fun saveAdministrator( administratorOAuth2User: AdministratorOAuth2User)
}