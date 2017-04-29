package myapp

import grails.gorm.transactions.Transactional

@Transactional
class BootStrapService {

	void init() {
		new Dummy(name: "dummy").save()
		assert Dummy.list()
	}

}
