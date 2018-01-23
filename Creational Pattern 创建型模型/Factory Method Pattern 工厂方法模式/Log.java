//��־��¼���ӿڣ������Ʒ  
interface Logger {  
    public void writeLog();  
}  

//���ݿ���־��¼���������Ʒ  
class DatabaseLogger implements Logger {  
    public void writeLog() {  
        System.out.println("���ݿ���־��¼��");  
    }  
}  

//�ļ���־��¼���������Ʒ  
class FileLogger implements Logger {  
    public void writeLog() {  
        System.out.println("�ļ���־��¼��");  
    }  
}  

//��־��¼�������ӿڣ����󹤳�  
interface LoggerFactory {  
    public Logger createLogger();  
}  

//���ݿ���־��¼�������ࣺ���幤��  
class DatabaseLoggerFactory implements LoggerFactory {  
    public Logger createLogger() {  
            //�������ݿ⣬����ʡ��  
            //�������ݿ���־��¼������  
            Logger logger = new DatabaseLogger();   
            //��ʼ�����ݿ���־��¼��������ʡ��  
            return logger;  
    }     
}  

//�ļ���־��¼�������ࣺ���幤��  
class FileLoggerFactory implements LoggerFactory {  
    public Logger createLogger() {  
            //�����ļ���־��¼������  
            Logger logger = new FileLogger();   
            //�����ļ�������ʡ��  
            return logger;  
    }     
}

class Client {  
    public static void main(String args[]) {  
        LoggerFactory factory;  
        Logger logger;  
        factory = new FileLoggerFactory(); //�����������ļ�ʵ��  
        logger = factory.createLogger();  
        logger.writeLog();  
    }  
}
