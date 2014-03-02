/*
 * Author: Henri Hietala
 */

use todo

db.dropDatabase()

db.createCollection('lanes')

db.lanes.insert({
	orderno: '1',
	name: 'todo',
	description: '',
	tasks: [
		{
			name: 'unit tests',
			description: ''
		},
		{
			name: 'learn scala',
			description: ''
		},
		{
			name: 'learn angularjs',
			description: ''
		},
		{
			name: 'optimize',
			description: ''
		},
		{
			name: 'testing',
			description: ''
		}
	]
})

db.lanes.insert({
	orderno: '2',
	name: 'implementing',
	description: '',
		tasks: [
		{
			name: 'bind lanes to db',
			description: ''
		},
		{
			name: 'bind tasks to db',
			description: ''
		},
		{
			name: 'user interface',
			description: ''
		}
	]
})

db.lanes.insert({
	orderno: '3',
	name: 'done',
	description: '',
		tasks: [
		{
			name: 'install play',
			description: ''
		},
		{
			name: 'setup the project',
			description: ''
		},
		{
			name: 'install mongodb',
			description: ''
		},
		{
			name: 'include angularjs',
			description: ''
		}
	]
})