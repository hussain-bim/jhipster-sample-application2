import { IActivity } from 'app/shared/model/activity.model';
import { IJob } from 'app/shared/model/job.model';

export interface ITask {
  id?: number;
  title?: string;
  description?: string;
  titles?: IActivity[];
  jobs?: IJob[];
}

export class Task implements ITask {
  constructor(public id?: number, public title?: string, public description?: string, public titles?: IActivity[], public jobs?: IJob[]) {}
}
