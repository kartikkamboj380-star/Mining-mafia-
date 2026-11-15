package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p057f6.C6982c;
import p057f6.E;
import p057f6.InterfaceC6983d;
import p057f6.w;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final w f39995a = new w(new G6.b() { // from class: g6.b
        @Override // G6.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final w f39996b = new w(new G6.b() { // from class: g6.c
        @Override // G6.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final w f39997c = new w(new G6.b() { // from class: g6.d
        @Override // G6.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final w f39998d = new w(new G6.b() { // from class: g6.e
        @Override // G6.b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    public static /* synthetic */ ScheduledExecutorService a(InterfaceC6983d interfaceC6983d) {
        return (ScheduledExecutorService) f39996b.get();
    }

    public static /* synthetic */ ScheduledExecutorService e(InterfaceC6983d interfaceC6983d) {
        return (ScheduledExecutorService) f39997c.get();
    }

    public static /* synthetic */ ScheduledExecutorService g(InterfaceC6983d interfaceC6983d) {
        return (ScheduledExecutorService) f39995a.get();
    }

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f39998d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C6982c.d(E.a(p047e6.a.class, ScheduledExecutorService.class), E.a(p047e6.a.class, ExecutorService.class), E.a(p047e6.a.class, Executor.class)).f(new p057f6.g() { // from class: g6.f
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return ExecutorsRegistrar.g(interfaceC6983d);
            }
        }).d(), C6982c.d(E.a(p047e6.b.class, ScheduledExecutorService.class), E.a(p047e6.b.class, ExecutorService.class), E.a(p047e6.b.class, Executor.class)).f(new p057f6.g() { // from class: g6.g
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return ExecutorsRegistrar.e(interfaceC6983d);
            }
        }).d(), C6982c.d(E.a(p047e6.c.class, ScheduledExecutorService.class), E.a(p047e6.c.class, ExecutorService.class), E.a(p047e6.c.class, Executor.class)).f(new p057f6.g() { // from class: g6.h
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return ExecutorsRegistrar.a(interfaceC6983d);
            }
        }).d(), C6982c.c(E.a(p047e6.d.class, Executor.class)).f(new p057f6.g() { // from class: g6.i
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return l.INSTANCE;
            }
        }).d());
    }
}
