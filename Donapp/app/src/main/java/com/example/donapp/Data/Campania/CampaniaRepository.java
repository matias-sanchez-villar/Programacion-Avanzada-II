package com.example.donapp.Data.Campania;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.donapp.Data.BaseRepository;
import com.example.donapp.Entity.Campana;
import com.example.donapp.Enums.StatusResponse;
import com.example.donapp.Interfaces.IQueryRepository;

public class CampaniaRepository extends BaseRepository<Campana> implements IQueryRepository<Campana> {
    private AsyncTask<String, Void, StatusResponse> thread;
    private AsyncTask<String, Void, Integer> createThread;
    private AsyncTask<String, Void, Campana> entityThread;

    public CampaniaRepository(Context context){
        this.context = context;
    }


    @Override
    public Integer create(Campana entity) {
        this.createThread = new CreateCampaniaAsync(entity, this.context);
        return this.createAsync(createThread);
    }

    @Override
    public StatusResponse update(Campana entity) {
        this.thread = new UpdateCampaniaAsync(entity, this.context);
        return this.updateAsync(thread);
    }

    @Override
    public StatusResponse delete(int id) {
        this.thread = new DeleteCampaniaAsync(id, this.context);
        return this.deleteAsync(id, thread);
    }

    @Override
    public StatusResponse selectAll() {
        this.thread = new DataCampaniaAsync(this.context);
        return this.selectAllAsync(thread);
    }

    @Override
    public StatusResponse selectAllForSpinner(Spinner spn) {
        this.thread = new DataCampaniaAsync(spn, this.context);
        return this.selectAllAsync(thread);
    }

    @Override
    public StatusResponse selectAllForListView(ListView lv) {
        this.thread = new DataCampaniaAsync(lv, context);
        return this.selectAllAsync(thread);
    }

    @Override
    public Campana selectEntity(Campana entity)  {
        return this.selectEntity(entityThread);
    }
}