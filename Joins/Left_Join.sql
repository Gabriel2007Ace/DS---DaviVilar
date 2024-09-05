SELECT ingredientes.nome, ingredientes.ID_prato, ingredientes.ID_bebida
FROM Ingredientes
LEFT JOIN Pedidos
ON ingredientes.ID_prato=pedidos.ID_prato;