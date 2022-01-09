package es2.DPs.ChainOfResponsability;

import es2.DPs.Categorias;
import es2.DPs.ChainOfResponsability.handlers.LogErrorHandler;
import es2.DPs.ChainOfResponsability.handlers.LogInfoHandler;
import es2.DPs.ChainOfResponsability.handlers.LogWarningHandler;
import es2.DPs.DesignPattern;

public class DPChainOfResponsability implements DesignPattern {
    @Override
    public String getName() {
        return "Chain of Responsability";
    }

    @Override
    public String getCategoria() {
        return Categorias.BEHAVIORAL;
    }

    @Override
    public String getDescription() {
        return "O padrão Chain of Responsability estabelece um comportamento \n" +
				" em que é montado uma cadeia de requisições sendo passadas de \n" +
				" uma para outra em ordem. Cada ponto dessa cadeia pode decidir \n" +
				" por processar a requisição ou por passar para o próximo ponto. ";
    }

    @Override
    public void runExample() {
		//Instancio os Handlers
        LogInfoHandler logInfoHandler = new LogInfoHandler();
        LogWarningHandler logWarningHandler = new LogWarningHandler();
        LogErrorHandler logErrorHandler = new LogErrorHandler();

        logInfoHandler.next(logWarningHandler);
        logWarningHandler.next(logErrorHandler);


        String response = logInfoHandler.handle("error");
        System.out.println(response);
    }
}