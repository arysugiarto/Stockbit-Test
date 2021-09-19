package com.stockbit.hiring.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\b"}, d2 = {"Lcom/stockbit/hiring/util/Const;", "", "()V", "Access", "DataStore", "Database", "File", "Network", "app_devDebug"})
public final class Const {
    @org.jetbrains.annotations.NotNull()
    public static final com.stockbit.hiring.util.Const INSTANCE = null;
    
    private Const() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stockbit/hiring/util/Const$Network;", "", "()V", "PREFIX", "", "PREFIX_GENERAL", "Example", "app_devDebug"})
    public static final class Network {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PREFIX_GENERAL = "v1/general/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PREFIX = "v1/";
        @org.jetbrains.annotations.NotNull()
        public static final com.stockbit.hiring.util.Const.Network INSTANCE = null;
        
        private Network() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stockbit/hiring/util/Const$Network$Example;", "", "()V", "DATA_EXAMPLE", "", "DATA_EXAMPLES", "app_devDebug"})
        public static final class Example {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String DATA_EXAMPLE = "data/top/totaltoptiervolfull?limit=10&tsym=USD";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String DATA_EXAMPLES = "data/top/pairs?fsym=BTC";
            @org.jetbrains.annotations.NotNull()
            public static final com.stockbit.hiring.util.Const.Network.Example INSTANCE = null;
            
            private Example() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stockbit/hiring/util/Const$Access;", "", "()V", "AUTH_PREFIX", "", "app_devDebug"})
    public static final class Access {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUTH_PREFIX = "Bearer";
        @org.jetbrains.annotations.NotNull()
        public static final com.stockbit.hiring.util.Const.Access INSTANCE = null;
        
        private Access() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stockbit/hiring/util/Const$Database;", "", "()V", "DATABASE_NAME", "", "Table", "app_devDebug"})
    public static final class Database {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DATABASE_NAME = "EXAMPLE_STOCKBIT";
        @org.jetbrains.annotations.NotNull()
        public static final com.stockbit.hiring.util.Const.Database INSTANCE = null;
        
        private Database() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stockbit/hiring/util/Const$Database$Table;", "", "()V", "EXAMPLE", "", "app_devDebug"})
        public static final class Table {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String EXAMPLE = "product_entity";
            @org.jetbrains.annotations.NotNull()
            public static final com.stockbit.hiring.util.Const.Database.Table INSTANCE = null;
            
            private Table() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stockbit/hiring/util/Const$DataStore;", "", "()V", "TOKEN", "", "USERNAME", "app_devDebug"})
    public static final class DataStore {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TOKEN = "TOKEN_KEY";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USERNAME = "USERNAME";
        @org.jetbrains.annotations.NotNull()
        public static final com.stockbit.hiring.util.Const.DataStore INSTANCE = null;
        
        private DataStore() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/stockbit/hiring/util/Const$File;", "", "()V", "Image", "Location", "MimeType", "Pending", "app_devDebug"})
    public static final class File {
        @org.jetbrains.annotations.NotNull()
        public static final com.stockbit.hiring.util.Const.File INSTANCE = null;
        
        private File() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stockbit/hiring/util/Const$File$Location;", "", "()V", "basePath", "", "storePath", "app_devDebug"})
        public static final class Location {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String basePath = "Stockbit/";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String storePath = "STOCKBIT/";
            @org.jetbrains.annotations.NotNull()
            public static final com.stockbit.hiring.util.Const.File.Location INSTANCE = null;
            
            private Location() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stockbit/hiring/util/Const$File$MimeType;", "", "()V", "image", "", "pdf", "app_devDebug"})
        public static final class MimeType {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String image = "image/jpeg";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String pdf = "application/pdf";
            @org.jetbrains.annotations.NotNull()
            public static final com.stockbit.hiring.util.Const.File.MimeType INSTANCE = null;
            
            private MimeType() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stockbit/hiring/util/Const$File$Image;", "", "()V", "defaultFileName", "", "app_devDebug"})
        public static final class Image {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String defaultFileName = "STOCKBIT-Image";
            @org.jetbrains.annotations.NotNull()
            public static final com.stockbit.hiring.util.Const.File.Image INSTANCE = null;
            
            private Image() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stockbit/hiring/util/Const$File$Pending;", "", "()V", "isPending", "", "notPending", "app_devDebug"})
        public static final class Pending {
            public static final int isPending = 1;
            public static final int notPending = 0;
            @org.jetbrains.annotations.NotNull()
            public static final com.stockbit.hiring.util.Const.File.Pending INSTANCE = null;
            
            private Pending() {
                super();
            }
        }
    }
}