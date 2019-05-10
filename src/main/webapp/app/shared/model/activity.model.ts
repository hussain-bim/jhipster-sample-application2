import { ITask } from 'app/shared/model/task.model';

export interface IActivity {
  id?: number;
  activityName?: string;
  activityDescription?: string;
  activityName?: ITask;
}

export class Activity implements IActivity {
  constructor(public id?: number, public activityName?: string, public activityDescription?: string, public activityName?: ITask) {}
}
