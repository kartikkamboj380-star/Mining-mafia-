package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public interface r extends ExecutorService, AutoCloseable {
    p submit(Callable callable);
}
