package com.google.firebase.perf.session;

import Y6.d;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class SessionManager extends b {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<V6.b>> clients;
    private final GaugeManager gaugeManager;
    private V6.a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), V6.a.c(UUID.randomUUID().toString()), a.b());
    }

    public static /* synthetic */ void b(SessionManager sessionManager, Context context, V6.a aVar) {
        sessionManager.gaugeManager.initializeGaugeMetadataManager(context);
        if (aVar.e()) {
            sessionManager.gaugeManager.logGaugeMetadata(aVar.h(), d.FOREGROUND);
        }
    }

    public static SessionManager getInstance() {
        return instance;
    }

    private void logGaugeMetadataIfCollectionEnabled(d dVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.h(), dVar);
        }
    }

    private void startOrStopCollectingGauges(d dVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, dVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        d dVar = d.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    @Override // com.google.firebase.perf.application.b, com.google.firebase.perf.application.a.b
    public void onUpdateAppState(d dVar) {
        super.onUpdateAppState(dVar);
        if (this.appStateMonitor.f()) {
            return;
        }
        if (dVar == d.FOREGROUND) {
            updatePerfSession(V6.a.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.f()) {
            updatePerfSession(V6.a.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(dVar);
        }
    }

    public final V6.a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<V6.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final V6.a aVar = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: V6.c
            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.b(this.f6131a, context, aVar);
            }
        });
    }

    public void setPerfSession(V6.a aVar) {
        this.perfSession = aVar;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<V6.b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(V6.a aVar) {
        if (aVar.h() == this.perfSession.h()) {
            return;
        }
        this.perfSession = aVar;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<V6.b>> it = this.clients.iterator();
                while (it.hasNext()) {
                    V6.b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.a(aVar);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.a());
        startOrStopCollectingGauges(this.appStateMonitor.a());
    }

    public SessionManager(GaugeManager gaugeManager, V6.a aVar, a aVar2) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = aVar;
        this.appStateMonitor = aVar2;
        registerForAppState();
    }
}
